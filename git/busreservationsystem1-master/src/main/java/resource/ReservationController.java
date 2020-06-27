package resource;

import java.util.Date;
import java.util.List;

import org.hibernate.annotations.Where;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import repository.ReservationRepository;
import model.ResponseDetails;
import model.BusDetails;

@RestController
@RequestMapping("/reservation/details")
public class ReservationController {
	
	private ReservationRepository reservationRepository;
	
	public ReservationController(ReservationRepository reservationRepository) {
		this.reservationRepository=reservationRepository;
	}
	
	@GetMapping("/{sourceCity}/{destCity}/{travelDate}")
	public List<BusDetails> getBusDetails(@PathVariable("sourceCity") final String sourceCity, @PathVariable("destCity") final String destCity, @PathVariable("travelDate") final Date travelDate){
		//return getBusDetails(sourceCity,destCity,travelDate);
		//return reservationRepository.findAll();
		/*reservationRepository.findAll(Where(WithSourceCity(sourceCity))
		.and(WithDestCity(destCity))
		.and(WithTravelDate(travelDate)));*/
		return reservationRepository.findAllBySourceCityAndDestCityAndTravelDate(sourceCity, destCity, travelDate);
		//return null;
	}
	
	

}
