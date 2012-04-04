IF EXISTS ( SELECT * FROM dbo.sysobjects WHERE NAME = 'SP_SEARCHEMPLOYEEINDIVISION')
BEGIN
	DROP PROC SP_SEARCHEMPLOYEEINDIVISION
END
GO
CREATE PROC SP_SEARCHEMPLOYEEINDIVISION
	@SECID VARCHAR
AS 
BEGIN
	IF EXISTS (SELECT * FROM SECTION WHERE SECID = @SECID)
	BEGIN
		SELECT A.NAME 
		FROM EMPLOYEE AS A 
		INNER JOIN DEPARTMENTS AS B 
	     ON B.DEP_ID = A.EmID
		
	END
END