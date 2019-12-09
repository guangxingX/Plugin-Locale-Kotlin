/*
 * Copyright 2018 Bakumon. https://github.com/Bakumon
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.mallotec.reb.localeplugin

import com.mallotec.reb.localeplugin.utils.getSPValue
import com.mallotec.reb.localeplugin.utils.saveSPValue

/**
 * 默认 Preference
 * @author Bakumon https://bakumon.me
 */
object LocaleDefaultSPHelper {

    /**
     * 语言
     */
    var language: String
        get() = BaseLocaleApplication.instance.getSPValue(
            LocaleConstant.LANGUAGE,
            "0"
        )
        set(value) = BaseLocaleApplication.instance.saveSPValue(
            LocaleConstant.LANGUAGE,
            value
        )
}