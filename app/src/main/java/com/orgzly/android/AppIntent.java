package com.orgzly.android;

public class AppIntent {
    public static final String ACTION_DB_UPGRADE_STARTED = "com.orgzly.intent.action.DB_UPGRADE_STARTED";
    public static final String ACTION_DB_UPGRADE_ENDED = "com.orgzly.intent.action.DB_UPGRADE_ENDED";
    public static final String ACTION_BOOK_IMPORTED = "com.orgzly.intent.action.BOOK_IMPORTED";
    public static final String ACTION_DB_CLEARED = "com.orgzly.intent.action.DB_CLEARED";
    public static final String ACTION_REPARSING_NOTES_STARTED = "com.orgzly.intent.action.REPARSING_NOTES_STARTED";
    public static final String ACTION_REPARSING_NOTES_ENDED = "com.orgzly.intent.action.REPARSING_NOTES_ENDED";

    public static final String ACTION_NOTE_MARK_AS_DONE = "com.orgzly.intent.action.NOTE_MARK_AS_DONE";
    public static final String ACTION_REMINDER_SNOOZE_REQUEST = "com.orgzly.intent.action.REMINDER_SNOOZE_REQUEST";

    public static final String ACTION_SYNC_STATUS = "com.orgzly.intent.action.SYNC_STATUS";
    public static final String ACTION_SYNC_START = "com.orgzly.intent.action.SYNC_START";
    public static final String ACTION_SYNC_STOP = "com.orgzly.intent.action.SYNC_STOP";

    public static final String ACTION_UPDATE_LIST_WIDGET = "com.orgzly.intent.action.UPDATE_LIST_WIDGET";
    public static final String ACTION_UPDATE_LAYOUT_LIST_WIDGET = "com.orgzly.intent.action.UPDATE_LAYOUT_LIST_WIDGET";
    public static final String ACTION_CLICK_LIST_WIDGET = "com.orgzly.intent.action.CLICK_LIST_WIDGET";
    public static final String ACTION_SET_FILTER_LIST_WIDGET = "com.orgzly.intent.action.SET_FILTER_LIST_WIDGET";

    public static final String ACTION_IMPORT_GETTING_STARTED_NOTEBOOK = "com.orgzly.intent.action.IMPORT_GETTING_STARTED_NOTEBOOK";
    public static final String ACTION_REPARSE_NOTES = "com.orgzly.intent.action.REPARSE_NOTES";
    public static final String ACTION_CLEAR_DATABASE = "com.orgzly.intent.action.CLEAR_DATABASE";

    public static final String ACTION_OPEN_NOTE = "com.orgzly.intent.action.OPEN_NOTE";
    public static final String ACTION_OPEN_BOOK = "com.orgzly.intent.action.OPEN_BOOK";

    public static final String ACTION_DISPLAY_MESSAGE = "com.orgzly.intent.action.DISPLAY_MESSAGE";

    public static final String EXTRA_MESSAGE = "com.orgzly.intent.extra.MESSAGE";
    public static final String EXTRA_BOOK_ID = "com.orgzly.intent.extra.BOOK_ID";
    public static final String EXTRA_NOTE_ID = "com.orgzly.intent.extra.NOTE_ID";
    public static final String EXTRA_QUERY_STRING = "com.orgzly.intent.extra.QUERY_STRING";
    public static final String EXTRA_PROPERTY_NAME  = "com.orgzly.intent.extra.PROPERTY_NAME";
    public static final String EXTRA_PROPERTY_VALUE  = "com.orgzly.intent.extra.PROPERTY_VALUE";
    public static final String EXTRA_NOTIFICATION_TAG = "com.orgzly.intent.extra.NOTIFICATION_TAG";
    public static final String EXTRA_NOTIFICATION_ID = "com.orgzly.intent.extra.NOTIFICATION_ID";
    public static final String EXTRA_NOTE_TIME_TYPE = "com.orgzly.intent.extra.NOTE_TIME_TYPE";
    public static final String EXTRA_SNOOZE_TIMESTAMP = "com.orgzly.intent.extra.SNOOZE_TIMESTAMP";
    public static final String EXTRA_CLICK_TYPE = "com.orgzly.intent.extra.CLICK_TYPE";
    public static final String EXTRA_SAVED_SEARCH_ID = "com.orgzly.intent.extra.SAVED_SEARCH_ID";
    public static final String EXTRA_IS_AUTOMATIC = "com.orgzly.intent.extra.IS_AUTOMATIC";
}
