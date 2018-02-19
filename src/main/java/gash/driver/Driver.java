package gash.driver;


import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


//@OneToMany(mappedBy="match_participant_id")

@Entity
@Table(name="driver", schema = "public")
public class Driver
{
     @Id
     int driverId;
     int scheduleId;
     int truckId;
     int routeId;
     int invoiceId;
     String driverNationalId;
     String driverName;
     String driverTelephoneNumber;
     Date driverBirthDate;
     Date lastUpdatedDateTime;

     public Driver(String driverNationalId, String driverName, Date birthDate, String telephoneNumber)
     {
         this.driverNationalId=driverNationalId;
         this.driverName= driverName;
         this.driverBirthDate=birthDate;
         this.driverTelephoneNumber=telephoneNumber;
     }
}