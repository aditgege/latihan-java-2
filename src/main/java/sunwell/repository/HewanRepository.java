/*
 * ${NAME}
 * Created on 2/10/20, 4:39 PM
 *
 * Copyright (c) 2020. Sunwell System CV, Bandung, Indonesia.
 */

package sunwell.repository;

import org.springframework.data.repository.CrudRepository;
import sunwell.entity.Hewan;

/**
 * @author Aditia Dwi
 */
public interface HewanRepository extends CrudRepository<Hewan, Integer>
{
}
