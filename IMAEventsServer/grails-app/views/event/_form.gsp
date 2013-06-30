<%@ page import="uk.ac.shu.ima.events.Event" %>



<div class="fieldcontain ${hasErrors(bean: eventInstance, field: 'eventName', 'error')} required">
	<label for="eventName">
		<g:message code="event.eventName.label" default="Event Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="eventName" required="" value="${eventInstance?.eventName}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: eventInstance, field: 'eventDate', 'error')} required">
	<label for="eventDate">
		<g:message code="event.eventDate.label" default="Event Date" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="eventDate" precision="day"  value="${eventInstance?.eventDate}"  />
</div>

<div class="fieldcontain ${hasErrors(bean: eventInstance, field: 'eventAddress', 'error')} required">
	<label for="eventAddress">
		<g:message code="event.eventAddress.label" default="Event Address" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="eventAddress" required="" value="${eventInstance?.eventAddress}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: eventInstance, field: 'region', 'error')} required">
	<label for="region">
		<g:message code="event.region.label" default="Region" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="region" name="region.id" from="${uk.ac.shu.ima.events.Region.list()}" optionKey="id" required="" value="${eventInstance?.region?.id}" class="many-to-one"/>
</div>

