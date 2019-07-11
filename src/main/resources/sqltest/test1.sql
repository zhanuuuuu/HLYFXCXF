
--储值卡消费记录的
SELECT  cMoneyNo,dSaleDate,cWhno,cSaleSheetNo,fMoney_o,
        fLeftMoney_o,fMoney,fLeftMoney,cOperNo,dSaleDatetime,cPosNo,cStoreNo=ISNULL(A.cStoreNo,''),cStoreName=ISNULL(B.cStoreName,'')
FROM Moneycard_Cust_Log A
LEFT JOIN Posmanagement_main.dbo.t_Store B
ON  A.cStoreNo=B.cStoreNo
WHERE A.cMoneyNo='00001783' ORDER BY A.dSaleDatetime DESC

--储值卡充值记录
SELECT TOP 100 cardno,beizhu,addMoney=ISNULL(Addmoney,0),operno,opername,home,
               addTime=ISNULL(AddmoneyDate,GETDATE()),dDatetime=ISNULL(dDatetime,GETDATE()) FROM MoneyCard_history
WHERE cardno='000000001'
ORDER BY addTime DESC

--会员卡
SELECT TOP 100 cVipno,cVipName=ISNULL(cVipName,''),cSex=ISNULL(cSex,''),dBirthday=ISNULL(dBirthday,''),dValidStart,dValidEnd,cTel=ISNULL(A.cTel,''),
			fCurValue=ISNULL(fCurValue,0),cStoreNo=ISNULL(a.cStoreNo,''),dCreadDate,cStoreName=ISNULL(B.cStoreName,0) FROM t_Vip A
LEFT JOIN t_Store B ON A.cStoreNo=B.cStoreNo
WHERE cVipno='000086'