package Entities;

import javax.persistence.*;
import java.util.Date;

public class Message {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int messageID ;
    private String Content;
    @Temporal(TemporalType.DATE)
    private Date sent_at;

}
