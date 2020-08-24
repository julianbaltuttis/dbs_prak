package org.tables;

import com.vladmihalcea.hibernate.type.array.StringArrayType;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@TypeDefs({
        @TypeDef(name = "string-array", typeClass = StringArrayType.class),
})

@MappedSuperclass @Getter @Setter
public class BaseEntity {
    @Id
    private Long id;
}
