package repositories;

import org.springframework.dao.DataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import entities.Daily;


public interface DailySaleRepository extends JpaRepository<Daily, Integer>{
	
	public Page<Daily> findAllDailySales(Pageable page);
	
	@Query(nativeQuery = true, value = "select count(*) from public.daily_seq where id_Daily= :id_Daily")
	public int findOneUserInt(@Param("id_Daily") int idDaily)
			throws DataAccessException;

}
