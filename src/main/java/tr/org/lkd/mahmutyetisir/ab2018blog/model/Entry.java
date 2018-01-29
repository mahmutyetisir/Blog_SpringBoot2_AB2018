package tr.org.lkd.mahmutyetisir.ab2018blog.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ENTRY")
public class Entry {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotEmpty
    @Column(name = "TITLE")
    private String title;

    @NotEmpty
    @Column(name = "BODY")
    private String body;

    @NotNull
    @Column(name = "CREATE_DATE")
    private LocalDate createDate = LocalDate.now();

    @NotEmpty
    @Column(name = "WRITER")
    private String writer;

    @Column(name = "IS_DELETED")
    private Boolean isDeleted;

}
