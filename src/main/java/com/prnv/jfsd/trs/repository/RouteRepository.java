package com.prnv.jfsd.trs.repository;

import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;

import com.prnv.jfsd.trs.entity.Route;
import com.prnv.jfsd.trs.entity.Train;

import java.util.List;

public interface RouteRepository extends JpaRepository<Route,Long>
{

    @Query("""
        SELECT r1.train
        FROM Route r1 JOIN Route r2
        ON r1.train = r2.train
        WHERE r1.station.stationName = :from
        AND r2.station.stationName = :to
        AND r1.stopOrder < r2.stopOrder
    """)
    List<Train> findTrainsBetweenStations(@Param("from") String from,
                                          @Param("to") String to);
}