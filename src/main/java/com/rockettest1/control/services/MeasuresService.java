package com.rockettest1.control.services;




import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.rockettest1.control.models.Measures;
import java.util.Optional;

/**
 * Service Interface for managing {@link Measures)
 */
public interface MeasuresService {

    /**
     * Save a measure.
     *
     * @param measures the entity to save.
     * @return the persisted entity.
     */
    Measures save(Measures measures);

    /**
     * Get all the products.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    Page<Measures> findAll(Pageable pageable);


    /**
     * Get the "id" product.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<Measures> findOne(Long id);

    /**
     * Delete the "id" product.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);




}
