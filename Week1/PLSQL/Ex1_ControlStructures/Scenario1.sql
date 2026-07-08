-- Scenario 1: Apply 1% interest rate discount for customers above 60 years.

SET SERVEROUTPUT ON;

BEGIN
    FOR rec IN (
        SELECT c.CustomerID,
               c.Name,
               l.LoanID,
               l.InterestRate,
               FLOOR(MONTHS_BETWEEN(SYSDATE, c.DOB)/12) AS Age
        FROM Customers c
        JOIN Loans l
        ON c.CustomerID = l.CustomerID
    )
    LOOP
        IF rec.Age > 60 THEN

            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE LoanID = rec.LoanID;

            DBMS_OUTPUT.PUT_LINE(
                'Discount applied to ' || rec.Name
            );

        END IF;
    END LOOP;

    COMMIT;
END;
/