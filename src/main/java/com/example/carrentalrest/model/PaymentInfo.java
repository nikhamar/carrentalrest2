package com.example.carrentalrest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="payment",schema = "carrentalschema")
public class PaymentInfo {
@Column(name = "cardname")
    public String cardName;

@Column(name = "cardnum")
    public int cardNum;
    @Column(name = "cardmonth")
    public int cardMonth;
    @Column(name = "cardyear")
    public int cardYear;
    @Column(name = "cvv")
    public int cvv;
    @Id
    @Column(name = "username")
    public String userName;

    public PaymentInfo(String cardName, int cardNum, int cardMonth, int cardYear, int cvv, String userName) {
        this.cardName = cardName;
        this.cardNum = cardNum;
        this.cardMonth = cardMonth;
        this.cardYear = cardYear;
        this.cvv = cvv;
        this.userName = userName;
    }

    public PaymentInfo() {
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public int getCardNum() {
        return cardNum;
    }

    public void setCardNum(int cardNum) {
        this.cardNum = cardNum;
    }

    public int getCardMonth() {
        return cardMonth;
    }

    public void setCardMonth(int cardMonth) {
        this.cardMonth = cardMonth;
    }

    public int getCardYear() {
        return cardYear;
    }

    public void setCardYear(int cardYear) {
        this.cardYear = cardYear;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
