package com.asterlink.rest.service;

import com.asterlink.rest.model.Account;

/**
 * Service interface for Account.
 * Declares implemented methods.
 * @author gl3bert
 */

public interface AccountService {

    // Save new account entry.
    int addAccount(String email, String password, String firstName, String lastName);

    // Verify login credentials.
    int checkCredentials(String email, String password);

    // Delete associated account.
    int deleteAccount(String email, String password);

    // Update user's display name.
    int updateName(String email, String firstName, String lastName);

    // Update user's password.
    int updatePassword(String email, String currentPassword, String newPassword);

    // TODO: Implement 2FA.

    /* Shorter, technical methods below. */

    // Get next ID number.
    long getNextAccountId();

    // Get account by associated email.
    Account getAccountByEmail(String email);

    // Get account by associated email; hide password.
    Account getAccountByEmailNoPassword(String email);
}
