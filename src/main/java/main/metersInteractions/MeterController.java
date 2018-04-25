package main.metersInteractions;

import main.customExceptions.ForbiddenException;
import main.db.entities.Meter;
import main.db.entities.MeterData;
import main.db.repositories.MeterDataRepository;
import main.db.repositories.MeterRepository;
import main.db.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
public class MeterController {

    private final MeterRepository meterRepository;
    private final MeterDataRepository meterDataRepository;
    private final UserRepository userRepository;

    @Autowired
    public MeterController(MeterRepository meterRepository, MeterDataRepository meterDataRepository, UserRepository userRepository) {
        this.meterRepository = meterRepository;
        this.meterDataRepository = meterDataRepository;
        this.userRepository = userRepository;
    }

    @RequestMapping(value = "/meterData/{apiKey}", method = RequestMethod.POST)
    public void addMeterData(@PathVariable(name = "apiKey") String apiKey, @RequestBody MeterData meterData) {
        Meter meter = meterRepository.findByApiKey(apiKey);
        if (meter != null) {
            meterData.setMeter(meter);
            meterData.setDateTime(new Date());
            meterDataRepository.save(meterData);
        } else {
            throw new ForbiddenException();
        }
    }

    @RequestMapping(value = "/meter/{meterId}/meterData", method = RequestMethod.GET)
    public @ResponseBody List<MeterData> getMeterData(@PathVariable(name = "meterId") int meterId) {
        return meterDataRepository.findByMeterId(meterId);
    }
}
