package jpa_basic.hellojpa.domain;

import java.time.LocalDateTime;
import javax.persistence.Embeddable;
import lombok.Getter;

@Embeddable
@Getter
public class Period {
    private LocalDateTime startDate;
    private LocalDateTime endDate;

    public Period() {
    }

    public Period(LocalDateTime startDate, LocalDateTime endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }
}
