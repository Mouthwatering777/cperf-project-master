package com.mshz.microproject.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import javax.validation.constraints.*;

import java.io.Serializable;

/**
 * A ProjectItemCheckJustificationFile.
 */
@Entity
@Table(name = "prj_item_check_justification_file")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class ProjectItemCheckJustificationFile implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @NotNull
    @Column(name = "file_id", nullable = false)
    private Long fileId;

    @NotNull
    @Column(name = "file_name", nullable = false)
    private String fileName;

    @NotNull
    @Column(name = "ticj_id", nullable = false)
    private Long ticjId;

    // jhipster-needle-entity-add-field - JHipster will add fields here
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFileId() {
        return fileId;
    }

    public ProjectItemCheckJustificationFile fileId(Long fileId) {
        this.fileId = fileId;
        return this;
    }

    public void setFileId(Long fileId) {
        this.fileId = fileId;
    }

    public String getFileName() {
        return fileName;
    }

    public ProjectItemCheckJustificationFile fileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Long getTicjId() {
        return ticjId;
    }

    public ProjectItemCheckJustificationFile ticjId(Long ticjId) {
        this.ticjId = ticjId;
        return this;
    }

    public void setTicjId(Long ticjId) {
        this.ticjId = ticjId;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ProjectItemCheckJustificationFile)) {
            return false;
        }
        return id != null && id.equals(((ProjectItemCheckJustificationFile) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "ProjectItemCheckJustificationFile{" +
            "id=" + getId() +
            ", fileId=" + getFileId() +
            ", fileName='" + getFileName() + "'" +
            ", ticjId=" + getTicjId() +
            "}";
    }
}
