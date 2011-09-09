<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<script type="text/javascript" src="resources/js/script.js">
jq(document).ready(function() {
	// Init datepicker
	alert('tettstss');
	initDatePicker('createdOn', true);

});


</script>
<div>
	<h2>
		<c:if test="${boxModel.modelId ne null and boxModel.modelId ne ''}">
			<spring:message code="edit.form.title" arguments="${boxModel.modelId}"/>
		</c:if>
		<c:if test="${boxModel.modelId eq null or boxModel.modelId eq ''}">
			<spring:message code="create.form.title"/>
		</c:if>	
	</h2>
	<sf:form method="POST" modelAttribute="boxModel" action="boxModel">
		<fieldset>
			<sf:hidden path="modelId"/>
			<table cellspacing="0">
				<tr>
					<td><label for="boxOne"><spring:message code="create.form.box.one"/>:</label></td>
					<td><sf:input path="boxOne" size="15" id="box_one" cssClass="textField"/></td>
					<td><sf:errors path="boxOne" cssClass="error" /></td>
				</tr>
				<tr>
					<td><label for="boxTwo"><spring:message code="create.form.box.two"/>:</label></td>
					<td><sf:input path="boxTwo" size="15" id="box_two" cssClass="textField"/></td>
					<td><sf:errors path="boxTwo" cssClass="error" /></td>
				</tr>
				<tr>
					<td><label for="boxThree"><spring:message code="create.form.box.three"/>:</label></td>
					<td><sf:input path="boxThree" size="15" id="box_three" cssClass="textField"/></td>
					<td><sf:errors path="boxThree" cssClass="error" /></td>
				</tr>
				<tr>
					<td><label for="boxFour"><spring:message code="create.form.box.four"/>:</label></td>
					<td><sf:input path="boxFour" size="15" id="box_four" cssClass="textField"/></td>
					<td><sf:errors path="boxFour" cssClass="error" /></td>
				</tr>
				<tr>
					<td><label for="boxFive"><spring:message code="create.form.box.five"/>:</label></td>
					<td><sf:input path="boxFive" size="15" id="box_five" cssClass="textField"/></td>
					<td><sf:errors path="boxFive" cssClass="error" /></td>
				</tr>
				<tr>
					<td><label for="boxArea"><spring:message code="create.form.box.five"/>:</label></td>
					<td><sf:textarea path="boxArea" rows="5" cols="30" id="box_area" /></td>
					<td><sf:errors path="boxArea" cssClass="error" /></td>
				</tr>
				
				<tr>
					<td><label for="type"><spring:message code="create.form.box.five"/>:</label></td>
					<td>
					<sf:radiobutton path="type" value="M" label="M" />
					 <sf:radiobutton	path="type" value="F" label="F" />
					<td><sf:errors path="type" cssClass="error" /></td>
				</tr>
				
				<c:set var="postCheckedStatus" value=""/>
				<c:set var="getCheckedStatus" value=""/>
				<c:if test="${boxModel.processingType eq 'post'}">
					<c:set var="postCheckedStatus" value="checked=checked"/>
				</c:if>
				<c:if test="${boxModel.processingType eq 'get'}">
					<c:set var="getCheckedStatus" value="checked=checked"/>
				</c:if>
				
				<tr>
					<td colspan="3">
						<table cellpadding="2" cellspacing="3">	
							<tr>
							<td nowrap="nowrap"><spring:message code="create.form.send.via.post"/></td>
							<td>
								<input type="radio" name="processingType" value="post" onclick="changeSendMethod(this.form,this.value)" ${postCheckedStatus}/>
							</td>
							<td nowrap="nowrap"><spring:message code="create.form.send.via.get"/></td>
							<td>
								<input type="radio" name="processingType" value="get" onclick="changeSendMethod(this.form,this.value)" ${getCheckedStatus}/>
							</td>
							<td width="100%"></td>
							</tr>
						</table>
					</td>	
				</tr>
				<tr>
					<td><a href="boxModel?new"><spring:message code="create.form.reset"/></a></td>
					<td>
						<input type="submit" value="Save Box Model" class="submitButton"/>
					</td>
				</tr>
			</table>
		</fieldset>
		<c:if test="${boxModel.modelId ne null and boxModel.modelId ne ''}">
			<fieldset id="resultsArea">
				<table>
					<tr>
						<td>
							<c:set var="processingType" value=""/>
							<c:if test="${boxModel.processingType eq 'post'}">
								<c:set var="processingType" value="HttpPOST"/>
							</c:if>
							<c:if test="${boxModel.processingType eq 'get'}">
								<c:set var="processingType" value="HttpGET"/>
							</c:if>
							<spring:message code="create.form.result.message" arguments="${processingType}"/>: 
							<ul>	
								<li><spring:message code="create.form.box.one"/> = ${boxModel.boxOne}</li>
								<li><spring:message code="create.form.box.two"/> = ${boxModel.boxTwo}</li>
								<li><spring:message code="create.form.box.three"/> = ${boxModel.boxThree}</li>
								<li><spring:message code="create.form.box.four"/> = ${boxModel.boxFour}</li>
								<li><spring:message code="create.form.box.five"/> = ${boxModel.boxFive}</li>
							</ul>
							<spring:message code="create.form.result.new.id.message" arguments="${boxModel.modelId}"/>
							<c:if test="${firstMatch ne null}">
								<ul>
									<c:forEach var="match" items="${firstMatch}">  
						           		<li>
						           		<spring:message code="create.form.result.message.match" arguments="${match.key},${firstMatch[match.key].name},${firstMatch[match.key].value}"/>
						           	</c:forEach>
						    	</ul>  
						    </c:if>
							<c:if test="${firstMatch eq null}">
								<br/>
								<spring:message code="create.form.result.message.no.match"/>
							</c:if>
						</td>
					</tr>
				</table>
			</fieldset>
		</c:if>	
	</sf:form>
</div>