package com.hanu.cloud.commons.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Hanumantharao Bitragunta
 */

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "payment")
public class Payment {

    @Id
    @GeneratedValue
    int payId;

    String debtor;
    String creditor;
    String amount;
}
