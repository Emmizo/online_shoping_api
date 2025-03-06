package com.ecommerce.ecommerce_backend.modal;

import com.ecommerce.ecommerce_backend.domain.AccountStatus;
import com.ecommerce.ecommerce_backend.domain.USER_ROLE;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode
public class Seller {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String sellerName;

    private String mobile;
    @Column(unique = true,nullable = false)
    private String email;
    private String password;

    @Embedded
    private BusinessDetails businessDetails = new BusinessDetails();

    @Embedded
    private BankDetails bankDetails = new BankDetails();

    @OneToOne(cascade = CascadeType.ALL)
    private Address pickupAddress = new Address();
    private String GSTIN;
    private USER_ROLE role = USER_ROLE.ROLE_SELLER;
    private AccountStatus accountStatus = AccountStatus.PENDING_VERIFICATION;

}
