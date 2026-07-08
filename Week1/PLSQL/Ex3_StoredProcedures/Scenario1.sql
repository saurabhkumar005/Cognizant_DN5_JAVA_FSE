
-- Scenario 1: Process Monthly Intrest

CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS

BEGIN
    UPDATE Accounts SET Balance = Balance + (Balance*0.01)
    WHERE AccountType='Savings';
    COMMIT;
    DBMS_OUTPUT.PUT_LINE(
        'Monthly interest processed successfully.'
    );
END;
/


-- To RUN: 
BEGIN
    ProcessMonthlyInterest;
END;
/