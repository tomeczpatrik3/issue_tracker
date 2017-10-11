package hu.elte.alkfejl.issuetracker.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "MESSAGES")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Message extends BaseEntity{
    @Column(nullable = false)
    private int issueID;
    
    @Column(nullable = false)
    private String message;
    
    @Column(nullable = false)
    private Date messageDate;
}
