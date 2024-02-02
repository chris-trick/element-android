/*
 * Copyright (c) 2024 New Vector Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package im.vector.app.mcf.common

object AppConst {
    // Backend environments the app will connect too, driven by the UI selector on the login screen
    const val ENVIRONMENT = "env"
    const val ENVIRONMENT_LIVE = "LIVE"
    const val ENVIRONMENT_INT2 = "INT2"
    const val ENVIRONMENT_QA = "QA"
    const val ENVIRONMENT_LIVE_HOME_SERVER_BASE_LIVE = "https://matrix-test.daern.org"
    const val ENVIRONMENT_LIVE_HOME_SERVER_BASE_INT2 = "https://matrix-test.daern.org"
    const val ENVIRONMENT_LIVE_HOME_SERVER_BASE_QA = "https://matrix-test.daern.org.qa"
}
