package com.tsg.simulator.base.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "workflow_template_root")
public class WorkflowTemplateRoot implements Serializable {
    @Id
    @Column(name = "uuid")
    private String uuid;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "creation_time")
    private LocalDateTime creationTime;

}
