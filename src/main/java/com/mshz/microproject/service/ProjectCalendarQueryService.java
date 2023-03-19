package com.mshz.microproject.service;

import java.util.List;

import javax.persistence.criteria.JoinType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.github.jhipster.service.QueryService;

import com.mshz.microproject.domain.ProjectCalendar;
import com.mshz.microproject.domain.*; // for static metamodels
import com.mshz.microproject.repository.ProjectCalendarRepository;
import com.mshz.microproject.service.dto.ProjectCalendarCriteria;

/**
 * Service for executing complex queries for {@link ProjectCalendar} entities in the database.
 * The main input is a {@link ProjectCalendarCriteria} which gets converted to {@link Specification},
 * in a way that all the filters must apply.
 * It returns a {@link List} of {@link ProjectCalendar} or a {@link Page} of {@link ProjectCalendar} which fulfills the criteria.
 */
@Service
@Transactional(readOnly = true)
public class ProjectCalendarQueryService extends QueryService<ProjectCalendar> {

    private final Logger log = LoggerFactory.getLogger(ProjectCalendarQueryService.class);

    private final ProjectCalendarRepository projectCalendarRepository;

    public ProjectCalendarQueryService(ProjectCalendarRepository projectCalendarRepository) {
        this.projectCalendarRepository = projectCalendarRepository;
    }

    /**
     * Return a {@link List} of {@link ProjectCalendar} which matches the criteria from the database.
     * @param criteria The object which holds all the filters, which the entities should match.
     * @return the matching entities.
     */
    @Transactional(readOnly = true)
    public List<ProjectCalendar> findByCriteria(ProjectCalendarCriteria criteria) {
        log.debug("find by criteria : {}", criteria);
        final Specification<ProjectCalendar> specification = createSpecification(criteria);
        return projectCalendarRepository.findAll(specification);
    }

    /**
     * Return a {@link Page} of {@link ProjectCalendar} which matches the criteria from the database.
     * @param criteria The object which holds all the filters, which the entities should match.
     * @param page The page, which should be returned.
     * @return the matching entities.
     */
    @Transactional(readOnly = true)
    public Page<ProjectCalendar> findByCriteria(ProjectCalendarCriteria criteria, Pageable page) {
        log.debug("find by criteria : {}, page: {}", criteria, page);
        final Specification<ProjectCalendar> specification = createSpecification(criteria);
        return projectCalendarRepository.findAll(specification, page);
    }

    /**
     * Return the number of matching entities in the database.
     * @param criteria The object which holds all the filters, which the entities should match.
     * @return the number of matching entities.
     */
    @Transactional(readOnly = true)
    public long countByCriteria(ProjectCalendarCriteria criteria) {
        log.debug("count by criteria : {}", criteria);
        final Specification<ProjectCalendar> specification = createSpecification(criteria);
        return projectCalendarRepository.count(specification);
    }

    /**
     * Function to convert {@link ProjectCalendarCriteria} to a {@link Specification}
     * @param criteria The object which holds all the filters, which the entities should match.
     * @return the matching {@link Specification} of the entity.
     */
    protected Specification<ProjectCalendar> createSpecification(ProjectCalendarCriteria criteria) {
        Specification<ProjectCalendar> specification = Specification.where(null);
        if (criteria != null) {
            if (criteria.getId() != null) {
                specification = specification.and(buildRangeSpecification(criteria.getId(), ProjectCalendar_.id));
            }
            if (criteria.getDayNumber() != null) {
                specification = specification.and(buildRangeSpecification(criteria.getDayNumber(), ProjectCalendar_.dayNumber));
            }
            if (criteria.getStartTime() != null) {
                specification = specification.and(buildRangeSpecification(criteria.getStartTime(), ProjectCalendar_.startTime));
            }
            if (criteria.getEndTime() != null) {
                specification = specification.and(buildRangeSpecification(criteria.getEndTime(), ProjectCalendar_.endTime));
            }
            if (criteria.getProjectId() != null) {
                specification = specification.and(buildRangeSpecification(criteria.getProjectId(), ProjectCalendar_.projectId));
            }
        }
        return specification;
    }
}
