<#import "parts/common.ftl" as c>
<#import "parts/login.ftl" as l>

<@security.authorize  access="hasAnyAuthority('ADMIN') and hasAnyAuthority('USER')">
<@c.page>
${message?ifExists}
<@l.login "/login" false/>
</@c.page>
</@security.authorize>