package com.github.curriculeon;

import com.github.curriculeon.arcade.ArcadeAccount;
import com.github.curriculeon.arcade.ArcadeAccountManager;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 7/21/2020.
 */
public class ApplicationRunnerTest {
    @Test
    public void test() { // TODO - replace boiler-plate logic with business logic
        // given
        Runnable runnable = new Arcade();

        // when
        runnable.run();

        // then
        Assert.assertNotNull(runnable.toString());
    }
    @Test
    public void AccountCreationTest(){
        ArcadeAccountManager arcadeAccountManager = new ArcadeAccountManager();

        ArcadeAccount newAccount = arcadeAccountManager.createAccount("Marcus","Password");

        arcadeAccountManager.registerAccount(newAccount);

        ArcadeAccount searchAccount = arcadeAccountManager.getAccount("Marcus", "Password");

        Assert.assertEquals(searchAccount, newAccount);

    }
}
