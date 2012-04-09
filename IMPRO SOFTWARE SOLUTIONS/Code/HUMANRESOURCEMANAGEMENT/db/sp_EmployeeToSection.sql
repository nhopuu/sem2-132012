IF EXISTS (SELECT * FROM DBO.SYSOBJECTS WHERE NAME='sp_EmployeeToSection')
BEGIN
	DROP PROC sp_EmployeeToSection
END
GO
CREATE PROC sp_EmployeeToSection
@EmID VARCHAR(10),
@SecID VARCHAR(10),
@DivisionID VARCHAR(10)
AS
BEGIN
	IF EXISTS (SELECT * FROM Employee WHERE EmID=@EmID)
	BEGIN
		UPDATE Employee SET SecID=@SecID WHERE EmID=@EmID
		--UPDATE Vacancies SET SecID=@SecID WHERE EmID=@EmID
		--DELETE FROM Division WHERE ID=@DivisionID
	END

END