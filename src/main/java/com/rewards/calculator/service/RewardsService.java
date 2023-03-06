package com.rewards.calculator.service;

import com.rewards.calculator.model.Rewards;



public interface RewardsService {
    public Rewards getRewardsByCustomerId(Long customerId);
}
