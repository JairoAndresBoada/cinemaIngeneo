package co.m.cinema.cinemaIngeneo.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cinema.cinemaIngeneo.exception.CinemaException;

import com.cinema.cinemaIngeneo.repository.ISucursalRepository;



@RunWith(SpringRunner.class)
@SpringBootTest
public class SucursalRespositoryImplTest {
	
	@Mock
	private ISucursalRepository sucursalrepository;
	
	@Test
	public void testInsertar() throws CinemaException {
		
	}

}
