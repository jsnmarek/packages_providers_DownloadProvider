/*
 * Copyright (C) 2013 The CyanogenMod Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.providers.downloads;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;

import org.cyanogenmod.support.ui.LiveFolder;

public class LiveFolderConfigActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent i = new Intent();
        // Set the receiver responsible for folder updates
        ComponentName receiver = new ComponentName(this, LiveFolderReceiver.class);
        i.putExtra(LiveFolder.Constants.FOLDER_RECEIVER_EXTRA, receiver);
        i.putExtra(LiveFolder.Constants.FOLDER_TITLE_EXTRA, getString(R.string.live_folder_label));
        setResult(RESULT_OK, i);
        finish();
    }

}
