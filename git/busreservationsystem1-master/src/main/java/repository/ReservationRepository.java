package repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import model.BusDetails;
import model.ResponseDetails;

public interface ReservationRepository extends JpaRepository<BusDetails, Integer>{
	
	@Query(value="select * from busdetails where source_city=%sourceCity% and dest_city=%destCity% and arr_date=%travelDate%")
	List<BusDetails> findAllBySourceCityAndDestCityAndTravelDate(String sourceCity, String destCity, Date travelDate);

}
