package com.prnv.jfsd.trs.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.prnv.jfsd.trs.entity.Train;
import com.prnv.jfsd.trs.repository.TrainRepository;

@Component
public class DataLoader implements CommandLineRunner
{

    @Autowired
    private TrainRepository trainRepository;

    @Override
    public void run(String... args)
    {
        if(trainRepository.count() == 0)
        {
            trainRepository.save(new Train("TR1001","Rajdhani Express"));
            trainRepository.save(new Train("TR1002","Duronto Express"));
            trainRepository.save(new Train("TR1003","Shatabdi Express"));
        }
    }
}