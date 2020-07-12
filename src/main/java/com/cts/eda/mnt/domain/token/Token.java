package com.cts.eda.mnt.domain.token;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "token")
public class Token {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "token_id_generator")
    @SequenceGenerator(name="token_id_generator", sequenceName = "token_id_seq", allocationSize = 1)
    @Column(name = "token_id", updatable = false, nullable = false)
    private  Long tokenId;

    @Column(name="status")
    private String tokenStatus;

    @Column(name="requestor")
    private  String tokenRequestor;

    @Column(name="creation_date")
    @Temporal(TemporalType.DATE)
    private  Date creationDate;

    @Column(name="last_updated")
    @Temporal(TemporalType.DATE)
    private  Date lastUpdated;

    public Long getTokenId() {
        return tokenId;
    }

    public void setTokenId(Long tokenId) {
        this.tokenId = tokenId;
    }

    public String getTokenStatus() {
        return tokenStatus;
    }

    public void setTokenStatus(String tokenStatus) {
        this.tokenStatus = tokenStatus;
    }

    public String getTokenRequestor() {
        return tokenRequestor;
    }

    public void setTokenRequestor(String tokenRequestor) {
        this.tokenRequestor = tokenRequestor;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Token token = (Token) o;
        return tokenId == token.tokenId &&
                Objects.equals(tokenStatus, token.tokenStatus) &&
                Objects.equals(tokenRequestor, token.tokenRequestor) &&
                Objects.equals(creationDate, token.creationDate) &&
                Objects.equals(lastUpdated, token.lastUpdated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tokenId, tokenStatus, tokenRequestor, creationDate, lastUpdated);
    }

    @Override
    public String toString() {
        return "Token{" +
                "tokenId=" + tokenId +
                ", tokenStatus='" + tokenStatus + '\'' +
                ", tokenRequestor='" + tokenRequestor + '\'' +
                ", creationDate=" + creationDate +
                ", lastUpdated=" + lastUpdated +
                '}';
    }
}
