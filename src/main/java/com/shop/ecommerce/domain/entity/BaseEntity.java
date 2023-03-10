package com.shop.ecommerce.domain.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.domain.Persistable;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.sql.Timestamp;

// TODO extend entities from this class to avoid boilerplate
@Setter
@Getter
@NoArgsConstructor
@MappedSuperclass
public class BaseEntity implements Persistable<Long> {

    @Id
    private Long id;

    @Version
    private Long version;

    @CreationTimestamp
    @Column(updatable = false, insertable = false)
    private Timestamp createdDate;

    @Override
    public boolean isNew() {
        return this.id == null;
    }
}