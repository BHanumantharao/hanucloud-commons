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
@Table(name = "ACCOUNT")
public class Account {

    @Id
    @GeneratedValue
    int id;

    String name;
    String accountNo;
    String branch;
}
