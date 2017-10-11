package hu.elte.alkfejl.issuetracker.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ISSUES")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Issue extends BaseEntity {
    @Column(nullable = false)
    private int userID;
    
    //A recordDate oszlop neve sql-ben RECORD_DATE lesz!
    //H2-ben lehet ellenőrizni a tábla oszlopainak nevét!
    @Column(nullable = false)
    private Date recordDate;
    
    @Column(nullable = false)
    private String description;
    
    @Column(nullable = false)
    private String location;
    
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Status status;
   
    public enum Status {
        OPEN, PENDING, ACCOMPLISHED, CLOSED
    }
}
