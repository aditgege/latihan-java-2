package sunwell.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sunwell.entity.Dokumen;

/**
 * @author Aditia Dwi
 */
@Repository
public interface DokumenRepo extends CrudRepository<Dokumen, Integer>
{
}
