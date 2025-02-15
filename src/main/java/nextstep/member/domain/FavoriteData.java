package nextstep.member.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import nextstep.subway.applicaion.dto.StationData;

@Table(name = "favorite")
@Entity
public class FavoriteData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @JsonIgnore
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "member_id")
    private Member member;
    @ManyToOne
    @JoinColumn(name = "source_id")
    private StationData source;
    @ManyToOne
    @JoinColumn(name = "target_id")
    private StationData target;

    public long getId() {
        return id;
    }

    public StationData getSource() {
        return source;
    }

    public StationData getTarget() {
        return target;
    }
}
