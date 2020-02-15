package easyFood.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import model.Narucenojelo;
import model.Narudzbina;

public interface NarucenoJeloRepo extends JpaRepository<Narucenojelo, Integer> {
		
	
	
}
