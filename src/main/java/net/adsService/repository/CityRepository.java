package net.adsService.repository;

import net.adsService.model.City;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CityRepository extends JpaRepository<City,Integer> {

    List<City> findAllByRegionId(int regionId);
}
