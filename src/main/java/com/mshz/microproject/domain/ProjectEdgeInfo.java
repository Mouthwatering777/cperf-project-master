package com.mshz.microproject.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import java.io.Serializable;

/**
 * A ProjectEdgeInfo.
 */
@Entity
@Table(name = "prj_edge_info")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class ProjectEdgeInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @Column(name = "source")
    private String source;

    @Column(name = "target")
    private String target;

    @Column(name = "source_handle")
    private String sourceHandle;

    @Column(name = "target_handle")
    private String targetHandle;

    @Column(name = "process_id")
    private Long processId;

    @Column(name = "valid")
    private Boolean valid;

    // jhipster-needle-entity-add-field - JHipster will add fields here
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSource() {
        return source;
    }

    public ProjectEdgeInfo source(String source) {
        this.source = source;
        return this;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTarget() {
        return target;
    }

    public ProjectEdgeInfo target(String target) {
        this.target = target;
        return this;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getSourceHandle() {
        return sourceHandle;
    }

    public ProjectEdgeInfo sourceHandle(String sourceHandle) {
        this.sourceHandle = sourceHandle;
        return this;
    }

    public void setSourceHandle(String sourceHandle) {
        this.sourceHandle = sourceHandle;
    }

    public String getTargetHandle() {
        return targetHandle;
    }

    public ProjectEdgeInfo targetHandle(String targetHandle) {
        this.targetHandle = targetHandle;
        return this;
    }

    public void setTargetHandle(String targetHandle) {
        this.targetHandle = targetHandle;
    }

    public Long getProcessId() {
        return processId;
    }

    public ProjectEdgeInfo processId(Long processId) {
        this.processId = processId;
        return this;
    }

    public void setProcessId(Long processId) {
        this.processId = processId;
    }

    public Boolean isValid() {
        return valid;
    }

    public ProjectEdgeInfo valid(Boolean valid) {
        this.valid = valid;
        return this;
    }

    public void setValid(Boolean valid) {
        this.valid = valid;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ProjectEdgeInfo)) {
            return false;
        }
        return id != null && id.equals(((ProjectEdgeInfo) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "ProjectEdgeInfo{" +
            "id=" + getId() +
            ", source='" + getSource() + "'" +
            ", target='" + getTarget() + "'" +
            ", sourceHandle='" + getSourceHandle() + "'" +
            ", targetHandle='" + getTargetHandle() + "'" +
            ", processId=" + getProcessId() +
            ", valid='" + isValid() + "'" +
            "}";
    }
}
