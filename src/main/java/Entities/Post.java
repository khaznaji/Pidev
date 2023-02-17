package Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

public class Post implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int postID;
    private String Post;
    private String postdescription;
    private String postimage;
    @Temporal(TemporalType.DATE)
    private Date Created_at;

}
