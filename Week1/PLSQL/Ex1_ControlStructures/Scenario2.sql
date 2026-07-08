
-- Scenario 2: Make customer VIP if Balance > 1000

SET SERVEROUTPUT ON;

BEGIN
    FOR rec IN (
        SELECT CustomerID, Name, Balance FROM Customers
    )
    LOOP
        IF rec.Balance > 10000 THEN
            UPDATE Customers SET IsVIP='TRUE'
            WHERE CustomerID=rec.CustomerID;
            DBMS_OUTPUT.PUT_LINE( rec.Name || ' promoted to VIP.' );
        END IF;
    END LOOP;
    COMMIT;
END;
/