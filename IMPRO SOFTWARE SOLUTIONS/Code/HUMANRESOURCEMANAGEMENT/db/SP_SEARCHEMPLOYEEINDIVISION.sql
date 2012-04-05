if exists (select * from dbo.sysobjects where name='SP_SEARCHEMPLOYEEINDIVISION')
begin 
	drop proc SP_SEARCHEMPLOYEEINDIVISION
end
go
CREATE PROC SP_SEARCHEMPLOYEEINDIVISION  
 @SECID VARCHAR(10) 

AS   
BEGIN  
 IF EXISTS (SELECT * FROM SECTION WHERE SECID = @SECID)  
 BEGIN  
  SELECT A.EmID,A.NAME, B.DEP_ID, C.SECID
  FROM EMPLOYEE AS A   
  INNER JOIN DEPARTMENTS AS B   
      ON A.DEP_ID = B.DEP_ID  
     INNER JOIN SECTION AS C  
   ON B.DEP_ID = C.DEPID  
  WHERE C.SECID=@SECID
 END  
END