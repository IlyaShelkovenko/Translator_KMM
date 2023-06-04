//
//  LanguageDropdown.swift
//  iosApp
//
//  Created by Шелковенко Илья Сергеевич on 04.06.2023.
//  Copyright © 2023 orgName. All rights reserved.
//

import SwiftUI
import shared

struct LanguageDropdown: View {
    var language: UiLanguage
    var isOpen: Bool
    var selectLanguage: (UiLanguage) -> Void
    
    var body: some View {
        Menu {
            VStack {
                ForEach(UiLanguage.Companion().allLanguages, id: \.self.language.langCode){ language in
                    LanguageDropdownItem(
                        language: language,
                        onClick: {
                            selectLanguage(language)
                        }
                    )
                }
            }
        } label: {
            HStack {
                SmallLanguageIcon(language: language)
                Text(language.language.langName)
                    .foregroundColor(.lightBlue)
                Image(systemName: isOpen ? "chevron.up" : "chevron.down")
                    .foregroundColor(.lightBlue)
            }
        }
    }
}

struct LanguageDropdown_Previews: PreviewProvider {
    static var previews: some View {
        LanguageDropdown(
            language: UiLanguage(language: .german, imageName: "german"),
            isOpen: true,
            selectLanguage: {language in }
        )
    }
}
