<%@ page import="uk.ac.shu.ima.events.Region" %>



<div class="fieldcontain ${hasErrors(bean: regionInstance, field: 'regionName', 'error')} required">
	<label for="regionName">
		<g:message code="region.regionName.label" default="Region Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="regionName" required="" value="${regionInstance?.regionName}"/>
</div>

