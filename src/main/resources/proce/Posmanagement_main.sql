/*
储值卡  消费记录
*/
IF EXISTS (SELECT * FROM DBO.SYSOBJECTS WHERE ID = OBJECT_ID(N'[dbo].[p_getMoneycard_Cust_Log_z]') and OBJECTPROPERTY(ID, N'IsProcedure') = 1)
BEGIN
	DROP PROCEDURE [dbo].[p_getMoneycard_Cust_Log_z]

END
GO
CREATE PROC [dbo].[p_getMoneycard_Cust_Log_z]
 @cMoneyNo varchar(100)
 AS
BEGIN
  SELECT  cMoneyNo,dSaleDate,cWhno,cSaleSheetNo,fMoney_o,
          fLeftMoney_o,fMoney,fLeftMoney,cOperNo,dSaleDatetime,
          cPosNo,cStoreNo=ISNULL(A.cStoreNo,''),cStoreName=ISNULL(B.cStoreName,'')
  FROM Supermarket.dbo.Moneycard_Cust_Log A
    LEFT JOIN Posmanagement_main.dbo.t_Store B
      ON  A.cStoreNo=B.cStoreNo
  WHERE A.cMoneyNo= @cMoneyNo ORDER BY A.dSaleDatetime DESC
END


/*
储值卡充值记录
*/
IF EXISTS (SELECT * FROM DBO.SYSOBJECTS WHERE ID = OBJECT_ID(N'[dbo].[p_getMoneyCard_history_z]') and OBJECTPROPERTY(ID, N'IsProcedure') = 1)
BEGIN
	DROP PROCEDURE [dbo].[p_getMoneyCard_history_z]

END
GO
CREATE PROC [dbo].[p_getMoneyCard_history_z]
 @cardno varchar(100)
 AS
BEGIN
  SELECT  cardno,beizhu,addMoney=ISNULL(Addmoney,0),operno,opername,home,
               addTime=ISNULL(AddmoneyDate,GETDATE()),
               dDatetime=ISNULL(dDatetime,GETDATE()) FROM MoneyCard_history
  WHERE cardno= @cardno
  ORDER BY addTime DESC
END