package com.github.curriculeon;

import com.github.curriculeon.arcade.ArcadeAccount;
import com.github.curriculeon.arcade.ArcadeAccountManager;
import org.junit.Assert;
import org.junit.Test;

public class ArcadeAccount_ManagerTest {

    @Test
    public void ArcadeAccount_AccountManagerTest(){
        //Given
        ArcadeAccountManager arcadeAccountManager = new ArcadeAccountManager();

        //When
        ArcadeAccount newAccount = arcadeAccountManager.createAccount("Marcus","Password");
        arcadeAccountManager.registerAccount(newAccount);

        ArcadeAccount searchAccount = arcadeAccountManager.getAccount("Marcus", "Password");

        //Then
        Assert.assertEquals(searchAccount, newAccount);

    }
}
