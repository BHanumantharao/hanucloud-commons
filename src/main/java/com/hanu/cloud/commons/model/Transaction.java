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
@Table(name = "TRANSACTION")
public class Transaction {

    @Id
    @GeneratedValue
    int id;

    String transactionId;
    String payId;
    String debtor;
    String creditor;
}
