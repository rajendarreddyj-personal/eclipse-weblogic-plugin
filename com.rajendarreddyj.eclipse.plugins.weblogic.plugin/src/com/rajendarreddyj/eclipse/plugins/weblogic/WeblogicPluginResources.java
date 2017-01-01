package com.rajendarreddyj.eclipse.plugins.weblogic;

/**
 * This interface has all Constants Used across plugin.
 * 
 * @author rajendarreddyj
 *
 */
public abstract interface WeblogicPluginResources {
	public static final String PREF_JRE = "jreid";
	public static final String PREF_ORACLEHOME = "oraclehome";
	public static final String PREF_WLHOME = "wlhome";
	public static final String PREF_DOMAINNAME = "domainname";
	public static final String PREF_DOMAINDIR = "domaindir";
	public static final String PREF_SERVERNAME = "servername";
	public static final String PREF_USERNAME = "username";
	public static final String PREF_PASSWORD = "password";
	public static final String PREF_HOSTNAME = "hostname";
	public static final String PREF_PORT = "port";
	public static final String PREF_PROJECTS = "projects";
	public static final String PREF_PRE_CLASSPATH = "preclasspath";
	public static final String PREF_POST_CLASSPATH = "postclasspath";
	public static final String PREF_JVM_OPTIONS = "jvmoptions";
	public static final String PREF_LIBPATH = "libpath";
	public static final String PREF_DEBUG_OPTIONS = "debugoptions";
	public static final String PREF_REMOTE_START = "remotestarturl";
	public static final String PREF_REMOTE_STOP = "remotestopurl";
	public static final String PREF_REMOTE_START_PORT = "remoteport";
	public static final String PATH_SEPARATOR = ";";
	public static final String WINDOWS_SEPARATOR = "\\";
	public static final String STRING_EMPTY = "";
	public static final String STRING_SINGLE_QUOTE = "'";
	public static final String STRING_COLON = ":";
	public static final String STRING_COMMA = ",";
	public static final String STRING_OPEN_PARANTHESIS = "(";
	public static final String STRING_CLOSE_PARANTHESIS = ")";
	public static final String DEFAULT_JVM_OPTIONS = "-server;-Xms256m;-Xmx512m;-Dweblogic.ProductionModeEnabled=false;-Xverify:none;";
	public static final String WEBLOGIC_START_MSG = WeblogicPlugin.getResourceString("action.weblogic.start.msg");
	public static final String WEBLOGIC_STOP_MSG = WeblogicPlugin.getResourceString("action.weblogic.stop.msg");
	public static final String WEBLOGIC_REMOTE_START_MSG = WeblogicPlugin.getResourceString("action.weblogic.remote.start.msg");
	public static final String WEBLOGIC_REMOTE_STOP_MSG = WeblogicPlugin.getResourceString("action.weblogic.remote.stop.msg");
	public static final String REMOTE_START_FAILED_MSG = WeblogicPlugin.getResourceString("action.weblogic.remote.start.failed.msg");
	public static final String REMOTE_STOP_FAILED_MSG = WeblogicPlugin.getResourceString("action.weblogic.remote.stop.failed.msg");
	public static final String START_FAILED_MSG = WeblogicPlugin.getResourceString("action.start.failed.msg");
	public static final String STOP_FAILED_MSG = WeblogicPlugin.getResourceString("action.stop.failed.msg");
	public static final String WEBLOGIC_LABEL = "WebLogic Server";
	public static final String WEBLOGIC_REMOTE_LABEL = "WebLogic Remote Handler";
	public static final String WEBLOGIC_MAIN_CLASS = "weblogic.Server";
	public static final String WEBLOGIC_WLST = "weblogic.WLST";
	public static final String BUTTON_ADD_LABEL = WeblogicPlugin.getResourceString("pref.button.add.label");
	public static final String BUTTON_REMOVE_LABEL = WeblogicPlugin.getResourceString("pref.button.remove.label");
	public static final String BUTTON_MODIFY_LABEL = WeblogicPlugin.getResourceString("pref.button.modify.label");
	public static final String BUTTON_UP_LABEL = WeblogicPlugin.getResourceString("pref.button.up.label");
	public static final String BUTTON_DOWN_LABEL = WeblogicPlugin.getResourceString("pref.button.down.label");
	public static final String BUTTON_ADDDIR_LABEL = WeblogicPlugin.getResourceString("pref.button.adddir.label");
	public static final String BUTTON_ADDJARZIP_LABEL = WeblogicPlugin.getResourceString("pref.button.addjarzip.label");
	public static final String JVM_DESCRIPTION_LABEL = WeblogicPlugin.getResourceString("pref.jvm.description.label");
	public static final String JVM_JAVAVM_LABEL = WeblogicPlugin.getResourceString("pref.jvm.javavm.label");
	public static final String JVM_OPTIONS_LABEL = WeblogicPlugin.getResourceString("pref.jvm.options.label");
	public static final String JVM_LIBRARYPATH_LABEL = WeblogicPlugin.getResourceString("pref.jvm.librarypath.label");
	public static final String JVM_NEW_LABEL = WeblogicPlugin.getResourceString("pref.jvm.new.label");
	public static final String JVM_ENTER_LABEL = WeblogicPlugin.getResourceString("pref.jvm.enter.label");
	public static final String WEBLOGIC_DESCRIPTION_LABEL = WeblogicPlugin.getResourceString("pref.weblogic.description.label");
	public static final String WEBLOGIC_VERSION_LABEL = WeblogicPlugin.getResourceString("pref.weblogic.version.label");
	public static final String WEBLOGIC_ORACLEHOME_LABEL = WeblogicPlugin.getResourceString("pref.weblogic.oraclehome.label");
	public static final String WEBLOGIC_WLHOME_LABEL = WeblogicPlugin.getResourceString("pref.weblogic.wlhome.label");
	public static final String WEBLOGIC_DOMAINNAME_LABEL = WeblogicPlugin.getResourceString("pref.weblogic.domainname.label");
	public static final String WEBLOGIC_DOMAINDIR_LABEL = WeblogicPlugin.getResourceString("pref.weblogic.domaindir.label");
	public static final String WEBLOGIC_SERVERNAME_LABEL = WeblogicPlugin.getResourceString("pref.weblogic.servername.label");
	public static final String WEBLOGIC_USER_LABEL = WeblogicPlugin.getResourceString("pref.weblogic.user.label");
	public static final String WEBLOGIC_PASSWORD_LABEL = WeblogicPlugin.getResourceString("pref.weblogic.password.label");
	public static final String WEBLOGIC_HOSTNAME_LABEL = WeblogicPlugin.getResourceString("pref.weblogic.hostname.label");
	public static final String WEBLOGIC_PORT_LABEL = WeblogicPlugin.getResourceString("pref.weblogic.port.label");
	public static final String WEBLOGIC_REMOTE_START_LABEL = WeblogicPlugin.getResourceString("pref.weblogic.remotestart.label");
	public static final String WEBLOGIC_REMOTE_STOP_LABEL = WeblogicPlugin.getResourceString("pref.weblogic.remotestop.label");
	public static final String WEBLOGIC_REMOTE_START_PORT_LABEL = WeblogicPlugin.getResourceString("pref.weblogic.remotestart.port.label");
	public static final String CLASSPATH_DESCRIPTION_LABEL = WeblogicPlugin.getResourceString("pref.classpath.description.label");
	public static final String CLASSPATH_BEFORE_LABEL = WeblogicPlugin.getResourceString("pref.classpath.before.label");
	public static final String CLASSPATH_AFTER_LABEL = WeblogicPlugin.getResourceString("pref.classpath.after.label");
	public static final String PROJECT_DESCRIPTION_LABEL = WeblogicPlugin.getResourceString("pref.project.description.label");
	public static final String PROJECT_LIST_LABEL = WeblogicPlugin.getResourceString("pref.project.list.label");
	public static final String PROJECT_SELECTION_LABEL = WeblogicPlugin.getResourceString("pref.project.selection.label");
	public static final String DEBUG_DESCRIPTION_LABEL = WeblogicPlugin.getResourceString("pref.debug.description.label");
	public static final String DEBUG_LIST_LABEL = WeblogicPlugin.getResourceString("pref.debug.list.label");
	public static final String DEBUG_SELECTION_LABEL = WeblogicPlugin.getResourceString("pref.debug.selection.label");
}
