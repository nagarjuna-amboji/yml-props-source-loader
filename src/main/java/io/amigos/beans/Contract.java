package io.amigos.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Contract {

    @Value("${contract.contractId}")
    private int contractId;
    @Value("${contract.contractName}")
    private String contractName;
    @Value("${contract.description}")
    private String description;
    @Value("${contract.contractBidPrice}")
    private double contractBidPrice;

    public int getContractId() {
        return contractId;
    }

    public void setContractId(int contractId) {
        this.contractId = contractId;
    }

    public String getContractName() {
        return contractName;
    }

    public void setContractName(String contractName) {
        this.contractName = contractName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getContractBidPrice() {
        return contractBidPrice;
    }

    public void setContractBidPrice(double contractBidPrice) {
        this.contractBidPrice = contractBidPrice;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "contractId=" + contractId +
                ", contractName='" + contractName + '\'' +
                ", description='" + description + '\'' +
                ", contractBidPrice=" + contractBidPrice +
                '}';
    }
}
