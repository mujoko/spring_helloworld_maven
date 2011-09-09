function compareTime(sTime1, sTime2){
    var t1=sTime1.split(":");
    var t2=sTime2.split(":");
    var h1 = parseInt(t1[0], 10);
    var h2 = parseInt(t2[0], 10);
    if(h1 > h2){
        return 1;
    } else if(h1 < h2){
        return -1;
    }
    var m1 = parseInt(t1[1], 10);
    var m2 = parseInt(t2[1], 10);
    if(m1 > m2){
        return 1;
    } else if(m1 < m2){
        return -1;
    }
    return 0;
}

function showCalanderFor(fieldId, largeRange){
	alert('Test');
	initDatePicker(fieldId, largeRange)
    jq("#" + fieldId).datepicker("show");
}

function initDatePicker(fieldId, largeRange, isAddSelectEvent){
    if(largeRange != null && largeRange == true){
        jq("#" + fieldId).datepicker({
            yearRange: '1900:2100',
            inline: true,
            changeMonth: true,
            changeYear: true,
            dateFormat: sGlobalDatePattern,  /*sGlobalDatePattern is defined in include.jsp*/
            onSelect: function(dateText, inst) {
                if(isAddSelectEvent != null && isAddSelectEvent == true){
                    onSelectDateTime();
                }
            }
        });
    } else{
        jq("#" + fieldId).datepicker({
            inline: true,
            changeMonth: true,
            changeYear: true,
            dateFormat: sGlobalDatePattern,  /*sGlobalDatePattern is defined in include.jsp*/
            onSelect: function(dateText, inst) {
                if(isAddSelectEvent != null && isAddSelectEvent == true){
                    onSelectDateTime();
                }
            }
        });
    }
	
	jq("#" + fieldId).attr("readonly", "readonly")
}

function onSelectDateTime(){
}

function formatDate(date){
    return jq.datepicker.formatDate(sGlobalDatePattern, date);
}

function parseDate(sDate){
    return jq.datepicker.parseDate(sGlobalDatePattern, sDate);
}

// JavaScript Document

function addEditRecord(theValue)
{
	/*if(theValue=='save')
	{
		document.all['screenDetail'].style.display='none';
		document.all['buttonSaveRecord'].style.display='none';
		document.all['buttonAddRecord'].style.display='';
		adjustScreen();
	}
	else
	{
		document.all['screenDetail'].style.display='';
		document.all['buttonSaveRecord'].style.display='';
		document.all['buttonAddRecord'].style.display='none';
		if(document.all["longSlide"])
		{
			document.all["longSlide"].style.height = 145;
		}
		if(document.all["longSlide2"])
		{
			document.all["longSlide2"].style.height = 115;
		}
		if(document.all["longSlide4"])
		{
			document.all["longSlide4"].style.height = 145;
		}
	}*/
}

function activeWindowEffect(obj)
{
	obj.getElementsByTagName("table")[0].getElementsByTagName("tr")[0].className = "windowHeaderOver";
}

function removeMenuSlider()
{
	adjustScreen();
}


function adjustScreen()
{
	if(navigator.appName=="Netscape")
	{
if (document.all["theContent"]!=null)

	    document.all["theContent"].style.height = window.innerHeight - 200;
	if (document.all["therightMarginContent"] != null)
		document.all["therightMarginContent"].style.height = window.innerHeight - 200;
if (document.all["theLoginContent"] != null)
		document.all["theLoginContent"].style.height = window.innerHeight - 120;
	
	    if (document.all["theContent1"] != null)
		    document.all["theContent1"].style.height = window.innerHeight - 240;
		if(document.all["longSlide"])
		{
			//document.all["longSlide"].style.width = window.innerWidth-250;//98;
			document.all["longSlide"].style.height = window.innerHeight-315;
		}

		if(document.all["longSlide2"])
		{
			//document.all["longSlide2"].style.width = window.innerWidth-250;//98;
			document.all["longSlide2"].style.height = window.innerHeight-397;
		}

		if(document.all["fullScreen"])
		{
			document.all["fullScreen"].style.width = window.innerWidth-250;//98;
			document.all["fullScreen"].style.height = window.innerHeight-290;
		}

		if(document.all["longClose"])
		{
			document.all["longClose"].style.width = window.innerWidth-260;
			document.all["longClose"].style.height = window.innerHeight-355;
		}
if(document.all["longClose2"])
		{
			document.all["longClose2"].style.width = window.innerWidth-260;
			document.all["longClose2"].style.height = window.innerHeight-355;
		}
		if(document.all["longSlide4"])
		{
			document.all["longSlide4"].style.width = window.innerWidth-98;
			document.all["longSlide4"].style.height = window.innerHeight-360;
		}

	}
	else
	{
if (document.all["theContent"]!=null)
	    document.all["theContent"].style.height = document.body.offsetHeight - 200;
	if (document.all["therightMarginContent"] != null)
	    document.all["therightMarginContent"].style.height = document.body.offsetHeight - 200;
	if (document.all["theLoginContent"] != null)
	    document.all["theLoginContent"].style.height = document.body.offsetHeight - 120;
	    
	    if (document.all["theContent1"]!=null)
		    document.all["theContent1"].style.height = document.body.offsetHeight - 285;
		
		if(document.all["longSlide"])
		{
		//	document.all["longSlide"].style.width = document.body.offsetWidth-250;//98;
			document.all["longSlide"].style.height = document.body.offsetHeight-325;
		}

		if(document.all["longSlide2"])
		{
		//	document.all["longSlide2"].style.width = document.body.offsetWidth-98;
			document.all["longSlide2"].style.height = document.body.offsetHeight-397;
		}
		
		if(document.all["fullScreen"])
		{
			document.all["fullScreen"].style.width = document.body.offsetWidth-98;
			document.all["fullScreen"].style.height = document.body.offsetHeight-290;
		}

		if(document.all["longClose"])
		{
			document.all["longClose"].style.width = document.body.offsetWidth-280;
			document.all["longClose"].style.height = document.body.offsetHeight-355;
		}
if(document.all["longClose2"])
		{
			document.all["longClose2"].style.width = document.body.offsetWidth-280;
			document.all["longClose2"].style.height = document.body.offsetHeight-355;
		}
		if(document.all["longSlide4"])
		{
			document.all["longSlide4"].style.width = document.body.offsetWidth-98;
			document.all["longSlide4"].style.height = document.body.offsetHeight-360;
		}
}
	
}


function sectionFocus(obj)
{
	clearFieldSetClass();
	
		obj.style.filter = 'alpha(opacity=' + 100 + ')';	
		obj.className = "theActive"
}

function clearFieldSetClass()
{	
	
	var elements = document.getElementsByTagName('fieldset');
	
	for(i = 0; i < elements.length; i++)
	{
		var obj = elements[i];
		if(obj.className == "gridActive")
			obj.className = "grid";
		else if(obj.className == "theActive")
			obj.className = "";
		
		obj.style.filter = 'alpha(opacity=' + 50 + ')';	
	}
}


function editRecord()
{
	document.all['recordEdit'].style.display="";
	document.all['recordNormal'].style.display="none";
}

function saveRecord(obj)
{
	document.all[obj].style.display="none";
}


function addRecord(obj)
{
	document.all[obj].style.display="";
}

function divResize()
{
	
}

function showHideSearch(Obj)
{
	if(Obj.id == "hideSearch")
	{
		Obj.style.display="none";
		document.all["showSearch"].style.display="";
		document.all["searchFilter"].style.display="none";
	}
	else
	{
		Obj.style.display="none";
		document.all["hideSearch"].style.display="";
		document.all["searchFilter"].style.display="";
	}
}



function activeInactive(Obj)
{
	if(Obj.className == "iconActive")
		Obj.className = "iconInactive";
	else
		Obj.className = "iconActive";
}

function tabOver(Obj)
{
	if(Obj.className != "tabActive")
		Obj.className = "tabOver";
}

function tabOut(Obj)
{
	if(Obj.className != "tabActive")
		Obj.className = "tabOut";
}

function tabClick(Obj)
{
	document.all["Tab01"].className = "tabOut";
	document.all["Tab02"].className = "tabOut";
	document.all["Tab03"].className = "tabOut";
	document.all["Tab04"].className = "tabOut";
	document.all["Tab05"].className = "tabOut";
	document.all["Tab06"].className = "tabOut";
	document.all["Tab07"].className = "tabOut";
	document.all["Tab08"].className = "tabOut";
	document.all["Tab09"].className = "tabOut";
	
	document.all["subTab00"].style.display="none";
	document.all["subTab01"].style.display="none";
	document.all["subTab02"].style.display="none";
	document.all["subTab03"].style.display="none";
	document.all["subTab04"].style.display="none";
	document.all["subTab05"].style.display="none";
	document.all["subTab06"].style.display="none";
	document.all["subTab07"].style.display="none";
	document.all["subTab08"].style.display="none";
	document.all["subTab09"].style.display="none";
	
	Obj.className = "tabActive";
	document.all["sub"+Obj.id].style.display="";
}

function showRecurring(objChecked, theValue)
{
	if(objChecked==true)
		document.all[theValue].style.display="";
	else
		document.all[theValue].style.display='none';
}

function displayOnAction(showId,hideId,obj)
{

if(obj.checked == true)
{
document.all[showId].style.display="";
document.all[hideId].style.display="none";

}
}

function DisplayPaymentOption(showId,hideId1,hideId2,obj)
{
if(obj.checked == true)
{
document.all[showId].style.display="";
document.all[hideId1].style.display="none";
document.all[hideId2].style.display="none";

}
}

function ChangeCellCompany()
{
	
 if(document.getElementsByName('ddlCellCompany').item(0).options[document.getElementsByName('ddlCellCompany').item(0).selectedIndex].value=="-1")
 {
	 
	 document.getElementsByName('txtCellCompany').item(0).disabled=false;
 }
 else
 {
	 document.getElementsByName('txtCellCompany').item(0).disabled=true;
	  }
 }
